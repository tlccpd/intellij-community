/*
 * Copyright 2000-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.keymap;

import com.intellij.util.containers.ContainerUtil;
import gnu.trove.THashMap;
import org.jetbrains.annotations.NonNls;

import java.util.Map;
import java.util.Set;

public abstract class KeymapsTestCase extends KeymapsTestCaseBase {
  // @formatter:off
  @NonNls @SuppressWarnings({"HardCodedStringLiteral"})
  protected static final Map<String, String[][]> DEFAULT_DUPLICATES = new THashMap<String, String[][]>(){{
    put("$default", new String[][] {
    { "ADD",                      "ExpandTreeNode", "Graph.ZoomIn"},
    { "BACK_SPACE",               "EditorBackSpace", "Images.Thumbnails.UpFolder"},
    { "ENTER",                    "Console.Execute", "Console.TableResult.EditValue", "DirDiffMenu.SynchronizeDiff", "EditorChooseLookupItem", "EditorEnter", "Images.Thumbnails.EnterAction", "NextTemplateVariable", "PropertyInspectorActions.EditValue"},
    { "F2",                       "GotoNextError", "GuiDesigner.EditComponent", "GuiDesigner.EditGroup", "Console.TableResult.EditValue", "XDebugger.SetValue", "Arrangement.Rule.Edit", "Git.Reword.Commit"},
    { "alt ENTER",                "ShowIntentionActions", "Console.TableResult.EditValue"},
    { "F5",                       "UML.ApplyCurrentLayout", "CopyElement"},
    { "F7",                       "NextDiff", "StepInto"},
    { "INSERT",                   "EditorToggleInsertState", "UsageView.Include", "DomElementsTreeView.AddElement", "DomCollectionControl.Add", "XDebugger.NewWatch"},
    { "SUBTRACT",                 "CollapseTreeNode", "Graph.ZoomOut"},
    { "TAB",                      "EditorChooseLookupItemReplace", "NextTemplateVariable", "NextParameter", "EditorIndentSelection", "EditorTab", "NextTemplateParameter", "ExpandLiveTemplateByTab"},
    { "alt DOWN",                 "ShowContent", "MethodDown", "Arrangement.Rule.Match.Condition.Move.Down"},
    { "alt UP",                   "MethodUp", "Arrangement.Rule.Match.Condition.Move.Up"},
    { "alt F1",                   "SelectIn", "ProjectViewChangeView"},
    { "alt INSERT",               "FileChooser.NewFolder", "Generate", "NewElement"},
    { "control F10",              "Android.HotswapChanges", "javaee.UpdateRunningApplication", "liveedit.UpdateRunningApplication"},
    { "control 1",                "FileChooser.GotoHome", "GotoBookmark1", "DuplicatesForm.SendToLeft"},
    { "control 2",                "FileChooser.GotoProject", "GotoBookmark2", "DuplicatesForm.SendToRight"},
    { "control 3",                "GotoBookmark3", "FileChooser.GotoModule"},
    { "control ADD",              "ExpandAll", "ExpandExpandableComponent", "ExpandRegion"},
    { "control DIVIDE",           "CommentByLineComment", "Images.Editor.ActualSize"},
    { "control DOWN",             "EditorScrollDown", "EditorLookupDown"},
    { "control ENTER",            "Console.Execute.Multiline", "DirDiffMenu.SynchronizeDiff.All", "EditorSplitLine", "ViewSource"},
    { "control EQUALS",           "ExpandAll", "ExpandExpandableComponent", "ExpandRegion"},
    { "control F5",               "Refresh", "Rerun"},
    { "control D",                "EditorDuplicate", "Diff.ShowDiff", "CompareTwoFiles", "SendEOF", "FileChooser.GotoDesktop"},
    { "control L",                "FindNext", "Vcs.Log.FocusTextFilter"},
    { "control M",                "EditorScrollToCenter", "Vcs.ShowMessageHistory"},
    { "control N",                "FileChooser.NewFolder", "GotoClass", "GotoChangedFile"},
    { "control P",                "FileChooser.TogglePathShowing", "ParameterInfo"},
    { "control R",                "Replace", "org.jetbrains.plugins.ruby.rails.console.ReloadSources"},
    { "control SLASH",            "CommentByLineComment", "Images.Editor.ActualSize"},
    { "control U",                "GotoSuperMethod", "CommanderSwapPanels"},
    { "control UP",               "EditorScrollUp", "EditorLookupUp"},
    { "control SUBTRACT",         "CollapseAll", "CollapseExpandableComponent", "CollapseRegion"},
    { "control alt A",            "ChangesView.AddUnversioned", "Diagram.DeselectAll"},
    { "control alt E",            "PerforceDirect.Edit", "Console.History.Browse"},
    { "control alt DOWN",         "NextOccurence", "Console.TableResult.NextPage"},
    { "control alt G",            "org.jetbrains.plugins.ruby.rails.actions.generators.GeneratorsPopupAction", "Mvc.RunTarget"},
    { "control alt R",            "org.jetbrains.plugins.ruby.tasks.rake.actions.RakeTasksPopupAction", "Django.RunManageTaskAction"},
    { "control alt UP",           "PreviousOccurence", "Console.TableResult.PreviousPage"},
    { "control alt N",            "Inline", "Console.TableResult.SetNull"},
    { "ctrl alt H",               "CallHierarchy", "ChangesView.ShelveSilently"},
    { "ctrl alt U",               "ShowUmlDiagramPopup", "ChangesView.UnshelveSilently"}, 
    { "control MINUS",            "CollapseAll", "CollapseExpandableComponent", "CollapseRegion"},
    { "control PERIOD",           "EditorChooseLookupItemDot", "CollapseSelection"},
    { "shift DELETE",             "$Cut", "Maven.Uml.Exclude"},
    { "shift ENTER",              "CollapseExpandableComponent", "Console.TableResult.EditValueMaximized", "DatabaseView.PropertiesAction", "EditorStartNewLine", "ExpandExpandableComponent", "OpenElementInNewWindow"},
    { "shift F4",                 "Debugger.EditTypeSource", "EditSourceInNewWindow"},
    { "shift F6",                 "RenameElement", "Git.Reword.Commit"},
    { "shift F7",                 "PreviousDiff", "SmartStepInto"},
    { "shift TAB",                "PreviousTemplateVariable", "PrevParameter", "EditorUnindentSelection", "PrevTemplateParameter"},
    { "shift alt L",              "org.jetbrains.plugins.ruby.console.LoadInIrbConsoleAction", "context.load"},
    { "shift control D",          "TagDocumentationNavigation", "Diff.ShowSettingsPopup", "Uml.ShowDiff", "Console.TableResult.CompareCells"},
    { "shift control DOWN",       "ResizeToolWindowDown", "MoveStatementDown"},
    { "shift control ENTER",      "EditorCompleteStatement", "Console.Jpa.GenerateSql"},
    { "shift control F10",        "Console.Open", "RunClass", "RunTargetAction"},
    { "shift control F8",         "ViewBreakpoints", "EditBreakpoint"},
    { "shift control G",          "ClassTemplateNavigation", "GoToClass"},
    { "shift control LEFT",       "EditorPreviousWordWithSelection", "ResizeToolWindowLeft", },
    { "shift control RIGHT",      "EditorNextWordWithSelection", "ResizeToolWindowRight", },
    { "shift control T",          "GotoTest", "Images.ShowThumbnails", "RunDashboard.ShowConfigurations"},
    { "shift control UP",         "ResizeToolWindowUp", "MoveStatementUp"},
    { "shift control alt D",      "UML.ShowChanges", "Console.TableResult.CloneColumn"},
    { "shift control U",          "ShelveChanges.UnshelveWithDialog", "EditorToggleCase"},
    { "shift control alt ENTER",  "Console.Jpa.GenerateDDL", "Console.Transaction.Commit"},
    { "control E",                "RecentFiles", "Vcs.ShowMessageHistory"},
    { "control alt Z",            "Vcs.RollbackChangedLines", "ChangesView.Revert"},
    { "control TAB",              "Switcher", "Diff.FocusOppositePane"},
    { "shift control TAB",        "Switcher", "Diff.FocusOppositePaneAndScroll"},
    { "ctrl alt ENTER",           "EditorStartNewLineBefore", "QuickActionPopup"},
    { "button2",                  "EditorPasteFromX11", "GotoDeclaration"}, // False positive: see DefaultKeymapImpl, PasteFromX11Action.update()
    });
    put("Mac OS X 10.5+", new String[][] {
    { "BACK_SPACE",               "$Delete", "EditorBackSpace", "Images.Thumbnails.UpFolder"},
    { "shift BACK_SPACE",         "EditorBackSpace", "UsageView.Include"},
    { "meta BACK_SPACE",          "EditorDeleteLine", "$Delete"},
    { "control DOWN",             "ShowContent", "EditorLookupDown", "MethodDown"},
    { "control UP",               "EditorLookupUp", "MethodUp"},
    { "control TAB",              "Switcher", "Diff.FocusOppositePane"},
    { "shift control TAB",        "Switcher", "Diff.FocusOppositePaneAndScroll"},
    { "meta L",                   "Vcs.Log.FocusTextFilter", "GotoLine"},
    { "meta R",                   "Refresh", "Rerun", "Replace", "org.jetbrains.plugins.ruby.rails.console.ReloadSources"},
    { "control O",                "ExportToTextFile", "OverrideMethods", },
    { "control ENTER",            "Generate", "NewElement"},
    { "ctrl meta R",              "Android.HotswapChanges", "RerunTests"},
    { "meta 1",                   "ActivateProjectToolWindow", "FileChooser.GotoHome", "DuplicatesForm.SendToLeft"},
    { "meta 2",                   "ActivateFavoritesToolWindow", "FileChooser.GotoProject", "DuplicatesForm.SendToRight"},
    { "meta 3",                   "ActivateFindToolWindow", "FileChooser.GotoModule"},
    { "meta N",                   "FileChooser.NewFolder", "Generate", "NewElement"},
    { "meta O",                   "GotoClass", "GotoChangedFile"},
    { "shift meta G",             "ClassTemplateNavigation", "GoToClass", "FindPrevious"},
    { "shift meta LEFT",          "EditorLineStartWithSelection", "ResizeToolWindowLeft", },
    { "shift meta RIGHT",         "EditorLineEndWithSelection", "ResizeToolWindowRight", },
    { "alt R",                    "Django.RunManageTaskAction", "org.jetbrains.plugins.ruby.tasks.rake.actions.RakeTasksPopupAction"},
    { "alt DOWN",                 "EditorUnSelectWord", "Arrangement.Rule.Match.Condition.Move.Down"},
    { "alt UP",                   "EditorSelectWord", "Arrangement.Rule.Match.Condition.Move.Up"},
    { "ctrl m",                   "EditorMatchBrace", "Vcs.ShowMessageHistory"},
    { "control P",                "EditorUp", "MethodOverloadSwitchUp"},
    { "control N",                "EditorDown", "MethodOverloadSwitchDown"},
    });
    put("Mac OS X", new String[][] {
    { "BACK_SPACE",               "$Delete", "EditorBackSpace", "Images.Thumbnails.UpFolder"},
    { "control DOWN",             "EditorLookupDown", "ShowContent", "MethodDown"},
    { "control UP",               "EditorLookupUp", "MethodUp"},
    { "control ENTER",            "Generate", "NewElement"},
    { "control F5",               "Refresh", "Rerun"},
    { "control TAB",              "Switcher", "Diff.FocusOppositePane"},
    { "control N",                "Generate", "NewElement"},
    { "shift control TAB",        "Switcher", "Diff.FocusOppositePaneAndScroll"},
    { "meta 1",                   "ActivateProjectToolWindow", "FileChooser.GotoHome", "DuplicatesForm.SendToLeft"},
    { "meta 2",                   "ActivateFavoritesToolWindow", "FileChooser.GotoProject", "DuplicatesForm.SendToRight"},
    { "meta 3",                   "ActivateFindToolWindow", "FileChooser.GotoModule"},
    { "shift meta LEFT",          "EditorLineStartWithSelection", "ResizeToolWindowLeft", },
    { "shift meta RIGHT",         "EditorLineEndWithSelection", "ResizeToolWindowRight", },
    { "alt R",                    "Django.RunManageTaskAction", "org.jetbrains.plugins.ruby.tasks.rake.actions.RakeTasksPopupAction"},
    });
    put("Emacs", new String[][] {
    { "TAB",                      "EditorChooseLookupItemReplace", "NextTemplateVariable", "NextParameter", "EditorIndentSelection",
                                  "EmacsStyleIndent", "NextTemplateParameter", "ExpandLiveTemplateByTab"},
    { "alt SLASH",                "CodeCompletion", "HippieCompletion"},
    { "control D",                "$Delete", "Diff.ShowDiff", "CompareTwoFiles", "SendEOF", "FileChooser.GotoDesktop"},
    { "control K",                "EditorCutLineEnd", "CheckinProject"},
    { "control L",                "EditorScrollToCenter", "Vcs.Log.FocusTextFilter"},
    { "control M",                "EditorEnter", "EditorChooseLookupItem", "NextTemplateVariable", "Console.Execute"},
    { "control N",                "EditorDown", "FileChooser.NewFolder"},
    { "control P",                "EditorUp", "FileChooser.TogglePathShowing"},
    { "control R",                "org.jetbrains.plugins.ruby.rails.console.ReloadSources", "FindPrevious"},
    { "control SLASH",            "$Undo", "Images.Editor.ActualSize"},
    { "control UP",               "EditorBackwardParagraph", "EditorLookupUp"},
    { "control DOWN",             "EditorForwardParagraph", "EditorLookupDown"},
    { "control alt A",            "MethodUp", "ChangesView.AddUnversioned", "Diagram.DeselectAll"},
    { "control alt E",            "MethodDown", "PerforceDirect.Edit", "Console.History.Browse"},
    { "control alt G",            "GotoDeclaration", "org.jetbrains.plugins.ruby.rails.actions.generators.GeneratorsPopupAction", "Mvc.RunTarget"},
    { "control alt S",            "ShowSettings", "Find"},
    { "shift alt S",              "FindUsages", "context.save"},
    { "shift alt G",              "GotoChangedFile", "GotoClass", "hg4idea.QGotoFromPatches"},
    { "shift alt P",              "ParameterInfo", "hg4idea.QPushAction"},
    { "shift control X",          SECOND_STROKE, "com.jetbrains.php.framework.FrameworkRunConsoleAction"},
    });
    put("Visual Studio", new String[][] {
    { "F5",                       "Resume", "UML.ApplyCurrentLayout"},
    { "F7",                       "NextDiff", "CompileDirty"},
    { "alt F2",                   "ShowBookmarks", "WebOpenInAction"},
    { "alt F8",                   "ReformatCode", "ForceStepInto", "EvaluateExpression"},
    { "control COMMA",            "GotoClass", "GotoChangedFile"},
    { "control F1",               "ExternalJavaDoc", "ShowErrorDescription"},
    { "control F10",              "Android.HotswapChanges", "RunToCursor", "javaee.UpdateRunningApplication", "liveedit.UpdateRunningApplication"},
    { "control N",                "FileChooser.NewFolder", "Generate", },
    { "control P",                "FileChooser.TogglePathShowing", "Print"},
    { "control alt F",            "ReformatCode", "IntroduceField"},
    { "shift F12",                "RestoreDefaultLayout", "FindUsagesInFile"},
    { "shift F2",                 "GotoPreviousError", "GotoDeclaration"},
    { "shift control F7",         "FindUsagesInFile", "HighlightUsagesInFile"},
    { "shift control I",          "ImplementMethods", "QuickImplementations"},
    { "alt F9",                   "ViewBreakpoints", "EditBreakpoint"},
    { "alt MULTIPLY",             "ShowExecutionPoint", "Images.Thumbnails.ToggleRecursive"},
    });
    put("Default for XWin", new String[][] {
    { "shift ctrl alt button1",   "EditorAddRectangularSelectionOnMouseDrag", "QuickEvaluateExpression"},
    });
    put("Default for GNOME", new String[][] {
    { "shift alt 1",              "SelectIn", "ProjectViewChangeView"},
    { "shift alt 7",              "IDEtalk.SearchUserHistory", "FindUsages"},
    { "shift alt LEFT",           "PreviousEditorTab", "Back"},
    { "shift alt RIGHT",          "NextEditorTab", "Forward"},
    });
    put("Default for KDE", new String[][] {
    { "control 1",                "FileChooser.GotoHome", "ShowErrorDescription", "DuplicatesForm.SendToLeft"},
    { "control 2",                "FileChooser.GotoProject", "Stop", "DuplicatesForm.SendToRight"},
    { "control 3",                "FindWordAtCaret", "FileChooser.GotoModule"},
    { "control 5",                "Refresh", "Rerun"},
    { "shift alt 1",              "SelectIn", "ProjectViewChangeView"},
    { "shift alt 7",              "IDEtalk.SearchUserHistory", "FindUsages"},
    { "shift alt L",              "ReformatCode", "org.jetbrains.plugins.ruby.console.LoadInIrbConsoleAction", "context.load"},
    });
    put("Eclipse", new String[][] {
    { "F2",                       "Console.TableResult.EditValue", "QuickJavaDoc", "XDebugger.SetValue", "Arrangement.Rule.Edit"},
    { "F5",                       "UML.ApplyCurrentLayout", "StepInto"},
    { "alt DOWN",                 "ShowContent", "MoveStatementDown", "Arrangement.Rule.Match.Condition.Move.Down"},
    { "alt UP",                   "MoveStatementUp", "Arrangement.Rule.Match.Condition.Move.Up"},
    { "alt HOME",                 "ViewNavigationBar", "ShowNavBar"},
    { "control F10",              "Android.HotswapChanges", "ShowPopupMenu", "javaee.UpdateRunningApplication", "liveedit.UpdateRunningApplication"},
    { "control D",                "EditorDeleteLine", "Diff.ShowDiff", "CompareTwoFiles", "SendEOF", "FileChooser.GotoDesktop"},
    { "control L",                "Vcs.Log.FocusTextFilter", "GotoLine"},
    { "control N",                "ShowPopupMenu", "FileChooser.NewFolder"},
    { "control P",                "FileChooser.TogglePathShowing", "Print"},
    { "control R",                "RunToCursor", "org.jetbrains.plugins.ruby.rails.console.ReloadSources"},
    { "control U",                "EvaluateExpression", "CommanderSwapPanels"},
    { "control alt DOWN",         "Console.TableResult.NextPage", "EditorDuplicateLines"},
    { "control alt E",            "Console.History.Browse", "ExecuteInPyConsoleAction", "PerforceDirect.Edit"},
    { "shift alt D",              "hg4idea.QFold", "Debug"},
    { "shift alt G",              "RerunTests", "hg4idea.QGotoFromPatches"},
    { "shift alt L",              "IntroduceVariable", "org.jetbrains.plugins.ruby.console.LoadInIrbConsoleAction", "context.load"},
    { "shift alt P",              "hg4idea.QPushAction", "ImplementMethods"},
    { "shift alt R",              "RenameElement", "Git.Reword.Commit"},
    { "shift alt S",              "ShowPopupMenu", "context.save"},
    { "shift alt T",              "ShowPopupMenu", "tasks.switch"},
    { "shift control DOWN",       "ResizeToolWindowDown", "MethodDown"},
    { "shift control E",          "EditSource", "RecentChangedFiles"},
    { "shift control F6",         "PreviousTab", "ChangeTypeSignature"},
    { "shift control F11",        "ToggleBookmark", "FocusTracer"},
    { "shift control G",          "FindUsagesInFile", "ClassTemplateNavigation", "GoToClass"},
    { "shift control I",          "QuickImplementations", "XDebugger.Inspect"},
    { "shift control UP",         "ResizeToolWindowUp", "MethodUp"},
    { "shift control K",          "Vcs.Push", "FindPrevious"},
    { "shift control X",          "EditorToggleCase", "com.jetbrains.php.framework.FrameworkRunConsoleAction"},
    { "shift control T",          "GotoClass", "GotoChangedFile"},
    });
    put("NetBeans 6.5", new String[][] {
    { "F4",                       "RunToCursor", "EditSource"},
    { "F5",                       "Debugger.ResumeThread", "Resume", "UML.ApplyCurrentLayout"},
    { "alt DOWN",                 "NextOccurence", "ShowContent", "Arrangement.Rule.Match.Condition.Move.Down"},
    { "alt UP",                   "PreviousOccurence", "Arrangement.Rule.Match.Condition.Move.Up"},
    { "control 1",                "ActivateProjectToolWindow", "DuplicatesForm.SendToLeft"},
    { "control 2",                "ActivateProjectToolWindow", "FileChooser.GotoProject", "DuplicatesForm.SendToRight"},
    { "control 3",                "ActivateProjectToolWindow", "FileChooser.GotoModule"},
    { "control BACK_SPACE",       "EditorDeleteToWordStart", "ToggleDockMode"},
    { "control DIVIDE",           "CollapseRegionRecursively", "Images.Editor.ActualSize"},
    { "control M",                "Vcs.ShowMessageHistory", "Move"},
    { "control N",                "NewElement", "FileChooser.NewFolder"},
    { "control R",                "RenameElement", "org.jetbrains.plugins.ruby.rails.console.ReloadSources", "Git.Reword.Commit"},
    { "control U",                SECOND_STROKE, "CommanderSwapPanels"},
    { "control O",                "GotoClass", "GotoChangedFile"},
    { "control PERIOD",           "GotoNextError", "EditorChooseLookupItemDot"},
    { "control alt DOWN",         "MethodDown", "Console.TableResult.NextPage"},
    { "control alt UP",           "MethodUp", "Console.TableResult.PreviousPage"},
    { "shift F4",                 "RecentFiles", "Debugger.EditTypeSource", "Vcs.ShowMessageHistory", "EditSourceInNewWindow"},
    { "shift alt F9",             "ChooseDebugConfiguration", "ValidateXml", "ValidateJsp"},
    { "shift alt D",              "ToggleFloatingMode", "hg4idea.QFold"},
    { "shift control DOWN",       "EditorDuplicate", "ResizeToolWindowDown", },
    { "shift control F7",         "HighlightUsagesInFile", "XDebugger.NewWatch"},
    { "shift control UP",         "EditorDuplicate", "ResizeToolWindowUp", },
    { "shift control alt P",      "Print", "Graph.Print"},
    { "shift control K",          "HippieCompletion", "Vcs.Push"},
    { "control alt E",            "Console.History.Browse", "ExecuteInPyConsoleAction", "PerforceDirect.Edit"},
    });
    put("JBuilder", new String[][] {
    { "F2",                       "EditorTab", "GuiDesigner.EditComponent", "GuiDesigner.EditGroup", "Console.TableResult.EditValue", "XDebugger.SetValue", "Arrangement.Rule.Edit", "Git.Reword.Commit"},
    { "F5",                       "ToggleBreakpointEnabled", "UML.ApplyCurrentLayout"},
    { "TAB",                      "EditorChooseLookupItemReplace", "NextTemplateVariable", "NextParameter", "EditorIndentSelection", "EmacsStyleIndent", "NextTemplateParameter", "ExpandLiveTemplateByTab"},
    { "control F6",               "PreviousEditorTab", "PreviousTab", },
    { "control L",                "Vcs.Log.FocusTextFilter", "EditorSelectLine"},
    { "control M",                "Vcs.ShowMessageHistory", "OverrideMethods", },
    { "control P",                "FileChooser.TogglePathShowing", "FindInPath"},
    { "shift control A",          "SaveAll", "GotoAction"},
    { "shift control E",          "RecentChangedFiles", "ExtractMethod"},
    { "shift control ENTER",      "FindUsages", "Console.Jpa.GenerateSql"},
    { "shift control F6",         "NextTab", "ChangeTypeSignature"},
    { "shift control G",          "GotoSymbol", "ClassTemplateNavigation", "GoToClass"},
    { "shift control X",          "EditorToggleShowWhitespaces", "com.jetbrains.php.framework.FrameworkRunConsoleAction"},
    });
    put("Eclipse (Mac OS X)", new String[][] {
    { "meta BACK_SPACE",          "EditorDeleteToWordStart", "$Delete"},
    { "F2",                       "Console.TableResult.EditValue", "QuickJavaDoc", "XDebugger.SetValue", "Arrangement.Rule.Edit", "Git.Reword.Commit"},
    { "F3",                       "GotoDeclaration", "EditSource"},
    { "F5",                       "StepInto", "UML.ApplyCurrentLayout"},
    { "alt DOWN",                 "MoveStatementDown", "Arrangement.Rule.Match.Condition.Move.Down"},
    { "alt UP",                   "MoveStatementUp", "Arrangement.Rule.Match.Condition.Move.Up"},
    { "control PERIOD",           "EditorChooseLookupItemDot", "HippieCompletion"},
    { "meta 1",                   "FileChooser.GotoHome", "ShowIntentionActions", "DuplicatesForm.SendToLeft"},
    { "meta 3",                   "FileChooser.GotoModule", "GotoAction"},
    { "meta D",                   "EditorDeleteLine", "Diff.ShowDiff", "CompareTwoFiles", "SendEOF", "FileChooser.GotoDesktop"},
    { "meta I",                   "DatabaseView.PropertiesAction", "AutoIndentLines"},
    { "meta P",                   "FileChooser.TogglePathShowing", "Print"},
    { "meta R",                   "org.jetbrains.plugins.ruby.rails.console.ReloadSources", "RunToCursor"},
    { "meta U",                   "CommanderSwapPanels", "EvaluateExpression"},
    { "meta W",                   "CloseContent", "CloseActiveTab"},
    { "shift meta T",             "GotoClass", "GotoChangedFile"},
    { "meta alt DOWN",            "Console.TableResult.NextPage", "EditorDuplicateLines"},
    { "shift meta F11",           "Run", "FocusTracer"},
    { "shift meta G",             "ClassTemplateNavigation", "GoToClass", "FindUsages"},
    { "shift meta K",             "Vcs.Push", "FindPrevious"},
    { "shift meta X",             "EditorToggleCase", "com.jetbrains.php.framework.FrameworkRunConsoleAction"},
    { "shift meta U",             "FindUsagesInFile", "ShelveChanges.UnshelveWithDialog"},
    { "control shift alt Z",      "Vcs.RollbackChangedLines", "ChangesView.Revert"},
    { "meta alt H",               "ChangesView.ShelveSilently", "RunDashboard.ShowConfigurations"}
    });
  }};
  // @formatter:on

  @NonNls protected static final Set<String> DEFAULT_UNKNOWN_ACTION_IDS = ContainerUtil.set(
    "ActivateVersionControlToolWindow", "ActivateFavoritesToolWindow", "ActivateCommanderToolWindow", "ActivateDebugToolWindow",
    "ActivateFindToolWindow",
    "ActivateHierarchyToolWindow", "ActivateMessagesToolWindow", "ActivateProjectToolWindow", "ActivateRunToolWindow",
    "ActivateStructureToolWindow", "ActivateTODOToolWindow", "ActivateWebToolWindow", "ActivatePaletteToolWindow",
    "ActivateTerminalToolWindow",
    "IDEtalk.SearchUserHistory", "IDEtalk.SearchUserHistory", "IDEtalk.Rename",
    ""
  );

  @NonNls protected static final Set<String> DEFAULT_BOUND_ACTIONS = ContainerUtil.set(
    "EditorDelete"
  );
}
