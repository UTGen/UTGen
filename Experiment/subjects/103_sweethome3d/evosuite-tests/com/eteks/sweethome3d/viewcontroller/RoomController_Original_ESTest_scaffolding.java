/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Mar 17 20:40:20 GMT 2024
 */

package com.eteks.sweethome3d.viewcontroller;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RoomController_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.eteks.sweethome3d.viewcontroller.RoomController"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @BeforeEach
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @AfterEach
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RoomController_Original_ESTest_scaffolding.class.getClassLoader() ,
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$SortableProperty",
      "com.eteks.sweethome3d.viewcontroller.RoomController$RoomPaint",
      "com.eteks.sweethome3d.model.CollectionListener",
      "com.eteks.sweethome3d.model.Home$Property",
      "com.eteks.sweethome3d.viewcontroller.ContentManager",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture",
      "com.eteks.sweethome3d.viewcontroller.PlanController",
      "com.eteks.sweethome3d.model.Compass$GeographicPoint",
      "com.eteks.sweethome3d.viewcontroller.RoomController$1",
      "com.eteks.sweethome3d.viewcontroller.RoomController$ModifiedRoom",
      "com.eteks.sweethome3d.viewcontroller.RoomController",
      "com.eteks.sweethome3d.viewcontroller.TextureChoiceController",
      "com.eteks.sweethome3d.viewcontroller.RoomController$Property",
      "com.eteks.sweethome3d.model.HomeTexture",
      "com.eteks.sweethome3d.model.Camera$Lens",
      "com.eteks.sweethome3d.viewcontroller.FurnitureController",
      "com.eteks.sweethome3d.model.Home$3",
      "com.eteks.sweethome3d.viewcontroller.RoomController$RoomsModificationUndoableEdit",
      "com.eteks.sweethome3d.model.Home$2",
      "com.eteks.sweethome3d.model.Home$1",
      "com.eteks.sweethome3d.viewcontroller.HelpController",
      "com.eteks.sweethome3d.model.HomeEnvironment$DrawingMode",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D",
      "com.eteks.sweethome3d.viewcontroller.View",
      "com.eteks.sweethome3d.viewcontroller.WizardController",
      "com.eteks.sweethome3d.viewcontroller.HomeFurnitureController",
      "com.eteks.sweethome3d.viewcontroller.FurnitureCatalogController",
      "com.eteks.sweethome3d.viewcontroller.ThreadedTaskController",
      "com.eteks.sweethome3d.model.CatalogTexture",
      "com.eteks.sweethome3d.model.BackgroundImage",
      "com.eteks.sweethome3d.viewcontroller.DialogView",
      "com.eteks.sweethome3d.model.Elevatable",
      "com.eteks.sweethome3d.model.CollectionChangeSupport",
      "com.eteks.sweethome3d.viewcontroller.Controller",
      "com.eteks.sweethome3d.viewcontroller.ObserverCameraController",
      "com.eteks.sweethome3d.viewcontroller.ImportedFurnitureWizardController",
      "com.eteks.sweethome3d.viewcontroller.HelpView",
      "com.eteks.sweethome3d.model.FurnitureCatalog",
      "com.eteks.sweethome3d.viewcontroller.ImportedFurnitureWizardStepsView",
      "com.eteks.sweethome3d.model.SelectionListener",
      "com.eteks.sweethome3d.viewcontroller.LevelController",
      "com.eteks.sweethome3d.model.TextureImage",
      "com.eteks.sweethome3d.viewcontroller.PlanView",
      "com.eteks.sweethome3d.viewcontroller.ViewFactory",
      "com.eteks.sweethome3d.viewcontroller.TextureChoiceView",
      "com.eteks.sweethome3d.viewcontroller.HomeController",
      "com.eteks.sweethome3d.model.DimensionLine",
      "com.eteks.sweethome3d.viewcontroller.ThreadedTaskView",
      "com.eteks.sweethome3d.model.Compass",
      "com.eteks.sweethome3d.swing.SwingViewFactory",
      "com.eteks.sweethome3d.model.Wall",
      "com.eteks.sweethome3d.viewcontroller.BackgroundImageWizardController",
      "com.eteks.sweethome3d.model.HomeEnvironment",
      "com.eteks.sweethome3d.model.HomePrint",
      "com.eteks.sweethome3d.viewcontroller.Home3DAttributesController",
      "com.eteks.sweethome3d.model.UserPreferences",
      "com.eteks.sweethome3d.model.Camera",
      "com.eteks.sweethome3d.model.AspectRatio",
      "com.eteks.sweethome3d.model.Room",
      "com.eteks.sweethome3d.model.Label",
      "com.eteks.sweethome3d.viewcontroller.LabelController",
      "com.eteks.sweethome3d.model.Selectable",
      "com.eteks.sweethome3d.viewcontroller.CompassController",
      "com.eteks.sweethome3d.viewcontroller.PhotoController",
      "com.eteks.sweethome3d.model.Home",
      "com.eteks.sweethome3d.model.PieceOfFurniture",
      "com.eteks.sweethome3d.viewcontroller.ImportedTextureWizardController",
      "com.eteks.sweethome3d.viewcontroller.PrintPreviewController",
      "com.eteks.sweethome3d.model.ObserverCamera",
      "com.eteks.sweethome3d.viewcontroller.HomeView",
      "com.eteks.sweethome3d.model.Level",
      "com.eteks.sweethome3d.viewcontroller.VideoController",
      "com.eteks.sweethome3d.viewcontroller.WallController",
      "com.eteks.sweethome3d.model.CatalogPieceOfFurniture",
      "com.eteks.sweethome3d.viewcontroller.PageSetupController",
      "com.eteks.sweethome3d.viewcontroller.UserPreferencesController"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RoomController_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.eteks.sweethome3d.viewcontroller.RoomController",
      "com.eteks.sweethome3d.viewcontroller.RoomController$Property",
      "com.eteks.sweethome3d.viewcontroller.RoomController$1",
      "com.eteks.sweethome3d.viewcontroller.RoomController$2",
      "com.eteks.sweethome3d.viewcontroller.RoomController$ModifiedRoom",
      "com.eteks.sweethome3d.viewcontroller.RoomController$RoomsModificationUndoableEdit",
      "com.eteks.sweethome3d.viewcontroller.RoomController$RoomPaint",
      "com.eteks.sweethome3d.viewcontroller.TextureChoiceController$Property",
      "com.eteks.sweethome3d.applet.HomeAppletRecorder",
      "com.eteks.sweethome3d.model.RecorderException",
      "com.eteks.sweethome3d.model.Home$1",
      "com.eteks.sweethome3d.model.Home",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$SortableProperty",
      "com.eteks.sweethome3d.model.CollectionChangeSupport",
      "com.eteks.sweethome3d.model.Camera",
      "com.eteks.sweethome3d.model.Camera$Lens",
      "com.eteks.sweethome3d.model.ObserverCamera",
      "com.eteks.sweethome3d.model.HomeEnvironment",
      "com.eteks.sweethome3d.model.HomeEnvironment$DrawingMode",
      "com.eteks.sweethome3d.model.AspectRatio",
      "com.eteks.sweethome3d.model.Compass",
      "com.eteks.sweethome3d.model.Compass$GeographicPoint",
      "com.eteks.sweethome3d.model.Home$2",
      "com.eteks.sweethome3d.model.Home$3",
      "com.eteks.sweethome3d.model.TextStyle",
      "com.eteks.sweethome3d.model.UserPreferences",
      "com.eteks.sweethome3d.tools.URLContent",
      "com.eteks.sweethome3d.io.FileUserPreferences",
      "com.eteks.sweethome3d.io.FileUserPreferences$1",
      "com.eteks.sweethome3d.io.FileUserPreferences$3",
      "com.eteks.sweethome3d.io.FileUserPreferences$PortablePreferences",
      "com.eteks.sweethome3d.tools.OperatingSystem",
      "com.eteks.sweethome3d.model.FurnitureCatalog",
      "com.eteks.sweethome3d.io.FileUserPreferences$4",
      "com.eteks.sweethome3d.io.DefaultFurnitureCatalog",
      "com.eteks.sweethome3d.io.DefaultFurnitureCatalog$2",
      "com.eteks.sweethome3d.io.DefaultFurnitureCatalog$PropertyKey",
      "com.eteks.sweethome3d.model.UserPreferences$1",
      "com.eteks.sweethome3d.tools.ResourceURLContent",
      "com.eteks.sweethome3d.io.DefaultUserPreferences",
      "com.eteks.sweethome3d.model.Wall",
      "com.eteks.sweethome3d.model.Label",
      "com.eteks.sweethome3d.swing.SwingViewFactory",
      "com.eteks.sweethome3d.swing.FileContentManager$1",
      "com.eteks.sweethome3d.swing.FileContentManager$2",
      "com.eteks.sweethome3d.swing.FileContentManager$3",
      "com.eteks.sweethome3d.swing.FileContentManager$4",
      "com.eteks.sweethome3d.swing.FileContentManager$5",
      "com.eteks.sweethome3d.swing.FileContentManager$6",
      "com.eteks.sweethome3d.swing.FileContentManager$7",
      "com.eteks.sweethome3d.swing.FileContentManager$8",
      "com.eteks.sweethome3d.swing.FileContentManager$9",
      "com.eteks.sweethome3d.swing.FileContentManager$10",
      "com.eteks.sweethome3d.swing.FileContentManager$11",
      "com.eteks.sweethome3d.swing.FileContentManager$12",
      "com.eteks.sweethome3d.swing.FileContentManager",
      "com.eteks.sweethome3d.io.HomeFileRecorder",
      "com.eteks.sweethome3d.io.DefaultHomeInputStream",
      "com.eteks.sweethome3d.applet.AppletContentManager",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$1",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$2",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$3",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$4",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$5",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$6",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$7",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$8",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$9",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$10",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$11",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$12",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$13",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$14",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$15",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$16",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$17",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$18",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$19",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture",
      "com.eteks.sweethome3d.model.HomeFurnitureGroup",
      "com.eteks.sweethome3d.model.Room",
      "com.eteks.sweethome3d.applet.AppletUserPreferences",
      "com.eteks.sweethome3d.applet.AppletUserPreferences$1",
      "com.eteks.sweethome3d.model.TexturesCatalog",
      "com.eteks.sweethome3d.applet.AppletUserPreferences$3",
      "com.eteks.sweethome3d.applet.AppletUserPreferences$4",
      "com.eteks.sweethome3d.io.DefaultTexturesCatalog",
      "com.eteks.sweethome3d.viewcontroller.HelpController",
      "com.eteks.sweethome3d.model.HomeApplication",
      "com.eteks.sweethome3d.viewcontroller.HomeController",
      "com.eteks.sweethome3d.viewcontroller.HomeController$1",
      "com.eteks.sweethome3d.viewcontroller.TextureChoiceController",
      "com.eteks.sweethome3d.viewcontroller.FurnitureCatalogController",
      "com.eteks.sweethome3d.model.CollectionEvent$Type",
      "com.eteks.sweethome3d.viewcontroller.PrintPreviewController",
      "com.eteks.sweethome3d.swing.PrintPreviewPanel",
      "com.eteks.sweethome3d.swing.ProportionalLayout",
      "com.eteks.sweethome3d.swing.ResourceAction",
      "com.eteks.sweethome3d.swing.PrintPreviewPanel$1",
      "com.eteks.sweethome3d.swing.PrintPreviewPanel$ActionType",
      "com.eteks.sweethome3d.swing.SwingTools",
      "com.eteks.sweethome3d.model.TexturesCategory",
      "com.eteks.sweethome3d.viewcontroller.WallController",
      "com.eteks.sweethome3d.model.CatalogPieceOfFurniture",
      "com.eteks.sweethome3d.viewcontroller.ThreadedTaskController",
      "com.eteks.sweethome3d.swing.ThreadedTaskPanel",
      "com.eteks.sweethome3d.viewcontroller.LevelController",
      "com.eteks.sweethome3d.viewcontroller.LevelController$Property",
      "com.eteks.sweethome3d.swing.LevelPanel",
      "com.eteks.sweethome3d.swing.FurnitureTable",
      "com.eteks.sweethome3d.swing.FurnitureTable$FurnitureTableModel",
      "com.eteks.sweethome3d.swing.FurnitureTable$FurnitureTableModel$1",
      "com.eteks.sweethome3d.swing.FurnitureTable$FurnitureTableColumnModel",
      "com.eteks.sweethome3d.swing.FurnitureTable$FurnitureTableColumnModel$21",
      "com.eteks.sweethome3d.swing.FurnitureTable$13",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$CameraControllerState",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$TopCameraState",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$TopCameraState$1",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$TopCameraState$2",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$TopCameraState$3",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$TopCameraState$4",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$TopCameraState$5",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$TopCameraState$6",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$ObserverCameraState",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$ObserverCameraState$1",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$ObserverCameraState$2",
      "com.eteks.sweethome3d.model.Camera$Property",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$1",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$2",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$3",
      "com.eteks.sweethome3d.viewcontroller.HomeController3D$4",
      "com.eteks.sweethome3d.model.HomeEnvironment$Property",
      "com.eteks.sweethome3d.viewcontroller.PageSetupController",
      "com.eteks.sweethome3d.swing.HomePane",
      "com.eteks.sweethome3d.swing.HomePane$7",
      "com.eteks.sweethome3d.viewcontroller.HomeView$ActionType",
      "com.eteks.sweethome3d.swing.ControllerAction",
      "com.eteks.sweethome3d.viewcontroller.FurnitureController",
      "com.eteks.sweethome3d.viewcontroller.PlanController",
      "com.eteks.sweethome3d.viewcontroller.FurnitureController$1",
      "com.eteks.sweethome3d.viewcontroller.FurnitureController$2",
      "com.eteks.sweethome3d.viewcontroller.FurnitureController$3",
      "com.eteks.sweethome3d.viewcontroller.PlanController$ControllerState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$AbstractModeChangeState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$SelectionState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$SelectionState$1",
      "com.eteks.sweethome3d.viewcontroller.PlanController$SelectionMoveState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$RectangleSelectionState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$PanningState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$DragAndDropState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$WallCreationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$AbstractWallState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$WallDrawingState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$WallResizeState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$PieceOfFurnitureRotationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$PieceOfFurnitureElevationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$PieceOfFurnitureHeightState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$PieceOfFurnitureResizeState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$LightPowerModificationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$PieceOfFurnitureNameOffsetState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$PieceOfFurnitureNameRotationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$CameraYawRotationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$CameraPitchRotationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$CameraElevationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$DimensionLineCreationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$DimensionLineDrawingState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$DimensionLineResizeState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$DimensionLineOffsetState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$RoomCreationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$AbstractRoomState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$RoomDrawingState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$RoomResizeState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$RoomAreaOffsetState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$RoomAreaRotationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$RoomNameOffsetState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$RoomNameRotationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$LabelCreationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$LabelRotationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$CompassRotationState",
      "com.eteks.sweethome3d.viewcontroller.PlanController$CompassResizeState",
      "com.eteks.sweethome3d.swing.MultipleLevelsPlanPanel",
      "com.eteks.sweethome3d.swing.PlanComponent",
      "com.eteks.sweethome3d.swing.PlanComponent$1",
      "com.eteks.sweethome3d.swing.PlanComponent$2",
      "com.eteks.sweethome3d.swing.PlanComponent$3",
      "com.eteks.sweethome3d.swing.PlanComponent$4",
      "com.eteks.sweethome3d.swing.PlanComponent$5",
      "com.eteks.sweethome3d.swing.PlanComponent$6",
      "com.eteks.sweethome3d.swing.PlanComponent$7",
      "com.eteks.sweethome3d.swing.PlanComponent$8",
      "com.eteks.sweethome3d.swing.PlanComponent$9",
      "com.eteks.sweethome3d.swing.PlanComponent$10",
      "com.eteks.sweethome3d.swing.PlanComponent$11",
      "com.eteks.sweethome3d.swing.PlanComponent$12",
      "com.eteks.sweethome3d.swing.PlanComponent$13",
      "com.eteks.sweethome3d.swing.PlanComponent$14",
      "com.eteks.sweethome3d.swing.PlanComponent$15",
      "com.eteks.sweethome3d.swing.PlanComponent$16",
      "com.eteks.sweethome3d.swing.PlanComponent$17",
      "com.eteks.sweethome3d.swing.PlanComponent$18",
      "com.eteks.sweethome3d.swing.PlanComponent$UserPreferencesChangeListener",
      "com.eteks.sweethome3d.viewcontroller.PhotoController",
      "com.eteks.sweethome3d.swing.HomeComponent3D",
      "com.eteks.sweethome3d.j3d.Object3DBranchFactory",
      "com.eteks.sweethome3d.swing.HomeComponent3D$ActionType",
      "com.eteks.sweethome3d.swing.HomeComponent3D$1MoveCameraAction",
      "com.eteks.sweethome3d.swing.HomeComponent3D$1ElevateCameraAction",
      "com.eteks.sweethome3d.swing.HomeComponent3D$1RotateCameraYawAction",
      "com.eteks.sweethome3d.swing.HomeComponent3D$1RotateCameraPitchAction",
      "com.eteks.sweethome3d.swing.SwingTools$1",
      "com.eteks.sweethome3d.swing.SwingTools$3",
      "com.eteks.sweethome3d.HomeFrameController",
      "com.eteks.sweethome3d.plugin.HomePluginController",
      "com.eteks.sweethome3d.viewcontroller.VideoController",
      "com.eteks.sweethome3d.viewcontroller.VideoController$Property",
      "com.eteks.sweethome3d.viewcontroller.VideoController$HomeEnvironmentChangeListener",
      "com.eteks.sweethome3d.swing.VideoPanel",
      "com.eteks.sweethome3d.swing.VideoPanel$ActionType",
      "com.eteks.sweethome3d.swing.VideoPanel$1",
      "com.eteks.sweethome3d.swing.HomeFurniturePanel",
      "com.eteks.sweethome3d.viewcontroller.WizardController",
      "com.eteks.sweethome3d.viewcontroller.ImportedTextureWizardController",
      "com.eteks.sweethome3d.viewcontroller.WizardController$1",
      "com.eteks.sweethome3d.viewcontroller.HomeController$28",
      "com.eteks.sweethome3d.viewcontroller.HomeController$29",
      "com.eteks.sweethome3d.swing.TextureChoiceComponent",
      "com.eteks.sweethome3d.swing.TextureChoiceComponent$1",
      "com.eteks.sweethome3d.swing.TextureChoiceComponent$2",
      "com.eteks.sweethome3d.swing.TextureChoiceComponent$3",
      "com.eteks.sweethome3d.model.CatalogTexture",
      "com.eteks.sweethome3d.swing.PageSetupPanel",
      "com.eteks.sweethome3d.swing.HomePrintableComponent$Variable",
      "com.eteks.sweethome3d.swing.PageSetupPanel$1",
      "com.eteks.sweethome3d.viewcontroller.HomeFurnitureController",
      "com.eteks.sweethome3d.viewcontroller.HomeFurnitureController$Property",
      "com.eteks.sweethome3d.plugin.PluginManager",
      "com.eteks.sweethome3d.plugin.PluginManager$1",
      "com.eteks.sweethome3d.viewcontroller.ObserverCameraController",
      "com.eteks.sweethome3d.viewcontroller.ObserverCameraController$Property",
      "com.eteks.sweethome3d.swing.ObserverCameraPanel",
      "com.eteks.sweethome3d.viewcontroller.CompassController",
      "com.eteks.sweethome3d.viewcontroller.CompassController$Property",
      "com.eteks.sweethome3d.swing.CompassPanel",
      "com.eteks.sweethome3d.viewcontroller.Home3DAttributesController",
      "com.eteks.sweethome3d.viewcontroller.Home3DAttributesController$Property",
      "com.eteks.sweethome3d.viewcontroller.Home3DAttributesController$EnvironmentPaint",
      "com.eteks.sweethome3d.swing.HelpPane",
      "com.eteks.sweethome3d.swing.HelpPane$ActionType",
      "com.eteks.sweethome3d.viewcontroller.BackgroundImageWizardController",
      "com.eteks.sweethome3d.swing.Home3DAttributesPanel",
      "com.eteks.sweethome3d.viewcontroller.LabelController",
      "com.eteks.sweethome3d.swing.LabelPanel",
      "com.eteks.sweethome3d.model.DimensionLine",
      "com.eteks.sweethome3d.model.HomePrint",
      "com.eteks.sweethome3d.swing.WizardPane",
      "com.eteks.sweethome3d.viewcontroller.ImportedFurnitureWizardController",
      "com.eteks.sweethome3d.viewcontroller.FurnitureCatalogController$FurnitureCatalogChangeListener",
      "com.eteks.sweethome3d.swing.FurnitureCatalogTree",
      "com.eteks.sweethome3d.swing.FurnitureCatalogTree$CatalogTreeModel",
      "com.eteks.sweethome3d.swing.FurnitureCatalogTree$CatalogTreeModel$CatalogFurnitureListener",
      "com.eteks.sweethome3d.swing.FurnitureCatalogTree$CatalogCellRenderer",
      "com.eteks.sweethome3d.swing.FurnitureCatalogTree$1",
      "com.eteks.sweethome3d.swing.FurnitureCatalogTree$2",
      "com.eteks.sweethome3d.swing.FurnitureCatalogTree$3",
      "com.eteks.sweethome3d.swing.FurnitureCatalogTree$4",
      "com.eteks.sweethome3d.viewcontroller.UserPreferencesController",
      "com.eteks.sweethome3d.swing.PhotoPanel",
      "com.eteks.sweethome3d.swing.PhotoPanel$ActionType",
      "com.eteks.sweethome3d.swing.PhotoPanel$1",
      "com.eteks.sweethome3d.swing.UserPreferencesPanel",
      "com.eteks.sweethome3d.viewcontroller.UserPreferencesController$Property",
      "com.eteks.sweethome3d.swing.WallPanel",
      "com.eteks.sweethome3d.tools.OperatingSystem$1",
      "com.eteks.sweethome3d.tools.OperatingSystem$2",
      "com.eteks.sweethome3d.io.DefaultHomeOutputStream",
      "com.eteks.sweethome3d.model.HomeRecorder$Type",
      "com.eteks.sweethome3d.swing.RoomPanel",
      "com.eteks.sweethome3d.model.LightSource",
      "com.eteks.sweethome3d.model.CollectionEvent",
      "com.eteks.sweethome3d.model.Home$4",
      "com.eteks.sweethome3d.model.HomeLight",
      "com.eteks.sweethome3d.swing.ImportedTextureWizardStepsPanel",
      "com.eteks.sweethome3d.io.DefaultHomeOutputStream$HomeObjectOutputStream",
      "com.eteks.sweethome3d.model.CatalogLight",
      "com.eteks.sweethome3d.model.Label$Property",
      "com.eteks.sweethome3d.model.Level",
      "com.eteks.sweethome3d.model.BackgroundImage",
      "com.eteks.sweethome3d.model.HomeDoorOrWindow",
      "com.eteks.sweethome3d.tools.TemporaryURLContent",
      "com.eteks.sweethome3d.viewcontroller.PhotoController$CameraChangeListener",
      "com.eteks.sweethome3d.viewcontroller.PhotoController$HomeCameraChangeListener",
      "com.eteks.sweethome3d.viewcontroller.PhotoController$HomeEnvironmentChangeListener",
      "com.eteks.sweethome3d.viewcontroller.PhotoController$Property",
      "com.eteks.sweethome3d.model.Sash",
      "com.eteks.sweethome3d.model.CatalogDoorOrWindow",
      "com.eteks.sweethome3d.swing.BackgroundImageWizardStepsPanel",
      "com.eteks.sweethome3d.swing.ImportedFurnitureWizardStepsPanel"
    );
  }
}
