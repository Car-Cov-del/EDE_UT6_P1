import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HolaLogger {

	private final static Logger LOGGER = Logger.getLogger(HolaLogger.class.getName());

	public static void main(String[] args) throws SecurityException, IOException {
		HolaLogger ejemplo = new HolaLogger();
		ejemplo.configurarLog();
		ejemplo.escribirEnLog();
	}

	
	private void borrarConsolaPorDefecto() {
        Logger rootLogger = Logger.getLogger("");
        Handler[] handlers = rootLogger.getHandlers();
        if (handlers[0] instanceof ConsoleHandler) {
            rootLogger.removeHandler(handlers[0]);
        }
	}
	
	public void configurarLog() throws SecurityException, IOException {
		this.borrarConsolaPorDefecto();
		
		// Creamos un manejador por consola que lo muestra todo
		Handler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.ALL);
		LOGGER.addHandler(consoleHandler);
		
		// El manejador a fichero a partir de INFO
		Handler fileTxt = new FileHandler("logging.txt");	
		SimpleFormatter simpleFormatter = new SimpleFormatter();
		fileTxt.setFormatter(simpleFormatter);
		fileTxt.setLevel(Level.INFO);
		LOGGER.addHandler(fileTxt);
		
		LOGGER.setLevel(Level.FINE);
	}

	public void escribirEnLog() {
		LOGGER.config("Mensaje de configuraci�n");
		LOGGER.fine("Depurando el programa");
		LOGGER.warning("Se ha lanzado una excepci�n");
		LOGGER.severe("No se ha podido conectar con la Base de Datos");
		LOGGER.log(Level.FINEST, "Depuraci�n m�s fina");
		LOGGER.log(Level.INFO, "El log se ha probado correctamente");
	}
}

//Ejercicio 4 - Log
//Crea una captura de pantalla para cada paso:
//1)Ejecuta HolaLogger y comprueba el fichero logging.txt
//2) ¿Qué sucede si eliminas la última línea del método configuraLog()? ¿Tanto la consola como el archivo generan el mismo contenido?
//3) A la hora de configurar el manejador a fichero, comenta el formateador y comprueba el fichero. ¿Cómo aparece ahora el texto?
//4) Finalmente, ¿Qué sucede si le añades un segundo parámetro a FileHandler con valor true?
//No hemos dado el logger