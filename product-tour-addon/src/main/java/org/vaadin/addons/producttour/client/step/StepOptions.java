package org.vaadin.addons.producttour.client.step;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

import org.vaadin.addons.producttour.client.button.StepButtonOptions;
import org.vaadin.addons.producttour.client.util.Command;
import org.vaadin.addons.producttour.shared.step.StepAnchor;

public class StepOptions extends JavaScriptObject {

  protected StepOptions() {}

  public static native StepOptions create() /*-{
    return {buttons: false, when: {}};
  }-*/;

  public final native void setClasses(String classes) /*-{
    this.classes = classes;
  }-*/;

  public final native void setTitle(String title) /*-{
    this.title = title;
  }-*/;

  public final native void setText(String text) /*-{
    this.text = text;
  }-*/;

  public final native void setShowCancelLink(boolean showCancelLink) /*-{
    this.showCancelLink = showCancelLink;
  }-*/;

  public final native void setScrollTo(boolean scrollTo) /*-{
    this.scrollTo = scrollTo;
  }-*/;

  public final native void setModal(boolean modal) /*-{
    this.modal = modal;
  }-*/;

  public final native void setWidth(String width) /*-{
    this.width = width;
  }-*/;

  public final native void setHeight(String height) /*-{
    this.height = height;
  }-*/;

  public final native void setAttachTo(Element element, StepAnchor anchor) /*-{
    if (element) {
      this.attachTo = {
        element: element,
        on: anchor.@java.lang.Enum::name.toLowerCase()
      }
    } else {
      this.attachTo = {};
    }
  }-*/;

  public final native void setButtons(boolean buttons) /*-{
    this.buttons = buttons;
  }-*/;

  public final native void addButtonOptions(StepButtonOptions buttonOptions) /*-{
    this.buttons = this.buttons || [];
    this.buttons.push(buttonOptions);
  }-*/;

  public final native void setShowListener(Command command) /*-{
    this.when.show = function () {
      $entry(function () {
        command.@org.vaadin.addons.producttour.client.util.Command::execute()()
      })();
    }
  }-*/;

  public native final void setCancelListener(Command command) /*-{
    this.when.cancel = function () {
      $entry(function () {
        command.@org.vaadin.addons.producttour.client.util.Command::execute()()
      })();
    }
  }-*/;

  public native final void setCompleteListener(Command command) /*-{
    this.when.complete = function () {
      $entry(function () {
        command.@org.vaadin.addons.producttour.client.util.Command::execute()()
      })();
    }
  }-*/;

  public native final void setHideListener(Command command) /*-{
    this.when.hide = function () {
      $entry(function () {
        command.@org.vaadin.addons.producttour.client.util.Command::execute()()
      })();
    }
  }-*/;
}
