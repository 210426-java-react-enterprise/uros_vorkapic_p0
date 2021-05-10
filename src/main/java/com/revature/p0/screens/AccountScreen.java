package com.revature.p0.screens;

import com.revature.p0.models.AppUser;
import com.revature.p0.util.ScreenRouter;

import java.io.BufferedReader;

public class AccountScreen extends Screen {

	private BufferedReader consoleReader;
	private ScreenRouter router;
	private AppUser currentUser;

	public AccountScreen(BufferedReader consoleReader, ScreenRouter router, AppUser currentUser) {
		super("AccountScreen", "/accounts");
		this.consoleReader = consoleReader;
		this.router = router;
		this.currentUser = currentUser;
	}

	@Override
	public void render() {

	}
}
