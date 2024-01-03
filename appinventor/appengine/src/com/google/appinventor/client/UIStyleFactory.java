package com.google.appinventor.client;

import com.google.appinventor.client.explorer.folder.ProjectFolder;
import com.google.appinventor.client.explorer.youngandroid.ProjectList;
import com.google.appinventor.client.wizards.youngandroid.NewYoungAndroidProjectWizard;
import com.google.gwt.core.client.GWT;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.FlowPanel;

public class UIStyleFactory {

  @UiTemplate("Ode.ui.xml")
  public interface OdeUiBinder extends UiBinder<FlowPanel, Ode> {}
  //@UiTemplate("style/GSoC/Ode.ui.xml")//del by 中文网
  //interface OdeUiBinderGSoC extends UiBinder<FlowPanel, Ode> {}

  public FlowPanel createOde(Ode target, String style) {
    if (style == "modern") {
      //OdeUiBinderGSoC ui_binder = GWT.create(OdeUiBinderGSoC.class);
      //return ui_binder.createAndBindUi(target);//del by 中文网
      return null;
    }
    OdeUiBinder ui_binder = GWT.create(OdeUiBinder.class);
    return ui_binder.createAndBindUi(target);
  }

  public ProjectList createProjectList() {
    return new ProjectList();
  }

  public ProjectFolder createProjectFolder(String name, long dateCreated, long dateModified, ProjectFolder parent) {
    return new ProjectFolder(name, dateCreated, dateModified, parent);
  }

  public ProjectFolder createProjectFolder(String name, long dateCreated, ProjectFolder parent) {
    return new ProjectFolder(name, dateCreated, parent);
  }

  public ProjectFolder createProjectFolder(JSONObject json, ProjectFolder parent) {
    return new ProjectFolder(json, parent);
  }

  public NewYoungAndroidProjectWizard createNewYoungAndroidProjectWizard() {
    return new NewYoungAndroidProjectWizard(null);
  }
}