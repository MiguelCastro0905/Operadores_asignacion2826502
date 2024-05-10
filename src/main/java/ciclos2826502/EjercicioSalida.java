package ciclos2826502;

public class EjercicioSalida {
    public static void main(String[] args) {

        ListaNotas l1 = new ListaNotas();
    

        Nota n1 = new Nota();
        Nota n2 = new Nota();
        Nota n3 = new Nota();
        Nota n4 = new Nota();
        Nota n5 = new Nota();
        Nota n6 = new Nota();
        Nota n7 = new Nota();
        Nota n8 = new Nota();
        Nota n9 = new Nota();
        Nota n10 = new Nota();
        
        n1.nota = 10;
        n2.nota = 8;
        n3.nota = 10;
        n4.nota = 8;
        n5.nota = 10;
        n6.nota = 8;
        n7.nota = 10;
        n8.nota = 8;
        n9.nota = 10;
        n10.nota = 8;

        l1.ListaNotas.add(n1);
        l1.ListaNotas.add(n2);
        l1.ListaNotas.add(n3);
        l1.ListaNotas.add(n4);
        l1.ListaNotas.add(n5);
        l1.ListaNotas.add(n6);
        l1.ListaNotas.add(n7);
        l1.ListaNotas.add(n8);
        l1.ListaNotas.add(n9);
        l1.ListaNotas.add(n10);

        

   
                
        for( Nota recorrerNota : l1.ListaNotas){
            System.out.println("Nota: "+ recorrerNota);
            }

            
        };


        
        
    }

     

 

