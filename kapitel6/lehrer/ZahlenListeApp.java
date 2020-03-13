import java.io.FileWriter;

public class ZahlenListenApp{
public static void main(String[] args){
FileWriter datei;
String text;
datei = new FileWriter("ausgabe.txt") // Schreibt die Datei in den workspace ordner!!
text= "1\n";
for(int i = 2 ; i <= 100; i++){
text+= i;
text+="\n";
}
datei.write(text,0,text.length());
datei.flush;
}
}
// 1. Was muss in dieser Klasse gemacht werden ? 
// 2. Schreiben Sie ein ExceptionHandling (Try Catch Block)
// 3. Wenn Sie den ExceptionHandler geschrieben haben, 
//	  setzen sie die Datei auf schreibgeschützt in Windows und
//    führen Sie das Programm erneut aus. Was passiert jetzt ?