package com.jetbrains.python.module;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.openapi.module.ModifiableModuleModel;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.SdkTypeId;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.platform.DirectoryProjectGenerator;
import com.jetbrains.python.PythonModuleTypeBase;
import com.jetbrains.python.sdk.PythonSdkType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yole
 */
public class PythonModuleBuilderBase extends ModuleBuilder {
  private final List<Runnable> mySdkChangedListeners = new ArrayList<Runnable>();
  private final DirectoryProjectGenerator myGenerator;
  private Sdk mySdk;

  public PythonModuleBuilderBase() {
    myGenerator = null;
  }

  public PythonModuleBuilderBase(DirectoryProjectGenerator generator) {
    myGenerator = generator;
  }

  @Override
  public String getGroupName() {
    return "Python";
  }

  public void setupRootModel(final ModifiableRootModel rootModel) throws ConfigurationException {
    if (mySdk != null) {
      rootModel.setSdk(mySdk);
    }
    else {
      rootModel.inheritSdk();
    }

    doAddContentEntry(rootModel);
  }

  @Override
  public ModuleType getModuleType() {
    return PythonModuleTypeBase.getInstance();
  }

  public Sdk getSdk() {
    return mySdk;
  }

  public void setSdk(final Sdk sdk) {
    if (mySdk != sdk) {
      mySdk = sdk;
      for (Runnable runnable : mySdkChangedListeners) {
        runnable.run();
      }
    }
  }

  public void addSdkChangedListener(Runnable runnable) {
    mySdkChangedListeners.add(runnable);
  }

  @Override
  public boolean isSuitableSdkType(SdkTypeId sdk) {
    return sdk instanceof PythonSdkType;
  }

  @Nullable
  @Override
  public Module commitModule(@NotNull Project project, @Nullable ModifiableModuleModel model) {
    Module module = super.commitModule(project, model);
    if (module != null && myGenerator != null) {
      ModuleRootManager moduleRootManager = ModuleRootManager.getInstance(module);
      VirtualFile[] contentRoots = moduleRootManager.getContentRoots();
      VirtualFile dir = module.getProject().getBaseDir();
      if (contentRoots.length > 0 && contentRoots[0] != null) {
        dir = contentRoots[0];
      }
      myGenerator.generateProject(project, dir, null, module);
    }
    return module;
  }
}
