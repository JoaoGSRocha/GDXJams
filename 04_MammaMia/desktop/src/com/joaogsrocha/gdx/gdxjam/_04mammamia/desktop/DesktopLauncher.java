package com.joaogsrocha.gdx.gdxjam._04mammamia.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.joaogsrocha.gdx.gdxjam._04mammamia.MammaMia;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MammaMia(), config);
	}
}
