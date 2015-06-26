package blade.sample;

import blade.Blade;
import blade.BladeApplication;
import blade.render.BeetlRender;

public class App extends BladeApplication{

	@Override
	public void init() {
		
		// 设置路由、拦截器包所在包
		Blade.defaultRoute("blade.sample");
		
		Blade.view("/views/", ".html");
		
		Blade.staticFolder("/res");
		
//		Blade.viewEngin(new JetbrickRender());
		Blade.viewEngin(new BeetlRender());
		
	}
		
	public static void main(String[] args) {
		Blade.run(App.class, 9000);
	}
}