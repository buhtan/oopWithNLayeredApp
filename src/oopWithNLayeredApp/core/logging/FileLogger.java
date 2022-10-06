package oopWithNLayeredApp.core.logging;



import oopWithNLayeredApp.core.logging.Logger;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Dosyaya loglandi : "+data);
		
	}

}
