package com.csc.fixture;

import org.apache.log4j.Logger;

import com.csc.action.PageAction;
import com.csc.logging.Log4jMachine;

public class InteractWebApplication {

	public InteractWebApplication() {
	}

	public void iSwitchToBrowser(String key) {
		PageAction.switchToBrowser(key);
	}

	public void iSwitchToWindowWithTitleContain(String title) {
		//Log4jMachine.info("i switch window");
		PageAction.switchToWindow(title);
	}

	public void iNavigateToPage(String url) {
		PageAction.iNavigateToPage(url);
	}

	public void iOpenBrowserAndNameIt(String browserType, String key) {
		PageAction.openNewBrowser(key, browserType);
	}

	public void iClickTheElement(String locator) throws InterruptedException {
		PageAction.iClickTheElement(locator);
	}

	public void iShouldSeeThePopupAppears(String windowId) {
		PageAction.iShouldSeeThePopupAppears(windowId);
	}

	public void iOpenThePopupWindowWith(String url, String windowId) {
		PageAction.iOpenThePopupWindowWith(url, windowId);
	}

	public void iCloseTheBrowser() {
		PageAction.iCloseTheBrowser();
	}

	public void iDoubleClickTheElement(String locator) {
		PageAction.iDoubleClickTheElement(locator);
	}

	public void iDragTheElementAndDropToTheElement(String locator1, String locator2) {
		PageAction.iDragTheElementAndDropToTheElement(locator1, locator2);
	}

	public void iMoveTheFocusToTheElement(String locator) {
		PageAction.iMoveTheFocusToTheElement(locator);
	}

	public void iPressTheLeftMouseButtonOnTheElement(String locator) {
		PageAction.iPressTheLeftMouseButtonOnTheElement(locator);
	}

	public void iReleaseTheLeftMouseButtonOnTheElement(String locator) {
		PageAction.iReleaseTheLeftMouseButtonOnTheElement(locator);
	}

	public void iPause(String waitTime) {
		PageAction.iPause(waitTime);
	}

	public void iRefresh() {
		PageAction.iRefresh();
	}

	public void iSelectTheOptionFromADropDown(String optionLocator, String selectLocator) {
		PageAction.iSelectTheOptionFromADropDown(optionLocator, selectLocator);
	}

	public void iSetTheInputWithValue(String locator, String value) {
		PageAction.iSetTheInputWithValue(locator, value);
	}

	public void iWaitForANewPageToLoad(String type, String value, String timeOut) {
		PageAction.iWaitForANewPageToLoad(type, value, timeOut);
	}

	public void iGiveFocusToTheCurrentlySelectedWindow() {
		PageAction.iGiveFocusToTheCurrentlySelectedWindow();
	}

	public void iExecuteJavascriptOnElement(String script, String locator) {
		PageAction.iExecuteJavascriptOnElement(script, locator);
	}

	public void iResizeCurrentlySelectedWindowToTakeUpTheEntireScreen() {
		PageAction.iResizeCurrentlySelectedWindowToTakeUpTheEntireScreen();
	}

	public void iWaitForMs(String time) {
		PageAction.iWaitForMs(time);

	}

}
