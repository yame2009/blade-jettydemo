package blade.sample;

import blade.Blade;
import blade.BladeApplication;
import blade.render.JetbrickRender;
import blade.server.BladeServer;

public class App implements BladeApplication{

	@Override
	public void init() {
		
		// 设置路由、拦截器包所在包
		Blade.defaultRoute("blade.sample");
		
		Blade.view("/views/", ".html");
		
		Blade.staticFolder("/res");
		
		Blade.viewEngin(new JetbrickRender());
	}
	
	public static void main(String[] args) {
		Blade.app(App.class);
		BladeServer.run(9000);
	}
}