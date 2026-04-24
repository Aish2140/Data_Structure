package interface_Package;

import com.sun.jdi.connect.spi.Connection;

interface OperatingSystem {
  void boot();
  void shutDown();
  default void installOS() {
	  //redunadantSolve();
	  System.out.println("Install app...");
  }
  static void checkForCompatibility() {
	  redunadantSolve();
	  
	  System.out.println("Yes it is compatible...");
  }
  private static void redunadantSolve() {
	  System.out.println("Check for internet Connection...");
	  System.out.println("check for the storage...");
	  
  }
  
  
	  
  
  
}
class Mac implements OperatingSystem{
	public void boot() {
		System.out.println("Mac is booting...");
	}
	public void shutDown() {
		System.out.println("Mac is shutting down..");
	}
	public void installOS(){
		System.out.println("installing on Mac...");
	}
}
	class Windows implements OperatingSystem {
		public void boot() {
			System.out.println("window is booting...");
		}
		public void shutDown() {
			System.out.println("window is shutting down..");
		}
		public void installOS(){
			System.out.println("installing on windows...");
		}
	}

		class FourTypesOfConcrete{
			public static void main(String[] args) {
					Windows win=new Windows();
					//win.installOS();
					OperatingSystem os=win;
					os.installOS();
					
					
					
					
				
				
			}
		}
			
	
