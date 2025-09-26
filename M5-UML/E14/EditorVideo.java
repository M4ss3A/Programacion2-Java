package tp5.ejercicio14;


public class EditorVideo {
      public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Exportando proyecto: " + render.getProyecto().getNombre());
        System.out.println("Formato:" + render.getFormato());
    }
}
