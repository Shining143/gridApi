package myPack;

import org.openqa.grid.selenium.GridLauncherV3;

public class StartHub {

	public static void main(String[] args) {
		
		String x[] = new String[] {"-role","hub","-port","4444"};
		GridLauncherV3.main(x);

	}

} 
//     http://192.168.0.112:4444/grid/register/
//     http://192.168.0.112:4444/wd/hub