package tp5.ejercicio14;


public class Main14 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Publicidad", 5);
        EditorVideo editor = new EditorVideo();
        editor.exportar("MP4", proyecto); // dependencia de creación
    }
}
