public class main
{
    public static void main (string[] args)
    {
        ListasEnlazada lista = new ListasEnlazada(); //SE CREA LA LISTA ENLAZADA
        lista.anadirInicio(23);
        lista.AnadirFinal(4);
        lista.AnadirFinal(74);
        lista.AnadirFinal(32);

        lista.borrarValor(74);

        lista.mostrar();
    }
}

//LAS LISTAS ENLAZADAS ESTAN COMPUESTAS DE NODOS

class nodo //AQUI SE CREA EL NODO
{
    int valor;
    nodo siguiente; //ESTE HARA REFERENCIA AL NODO SIGUIENTE 

    nodo(int valor) //ESTE CONSTRUCTOR NOS AYUDARA A DARLE UN VALOR AL NODO CUANDO SE CREA UNO NUEVO
    {
        this.valor = valor; //EL VALOR DE AQUI ES EL MISMO QUE EL DEL PARAMETRO
    }
}

class ListasEnlazada
{
    nodo cabeza; //ESTE NODO LE DA ACCESO A LA LISTA, POR ESO LE LLAMAN NODO CABECERO

    public void AnadirFinal(int valor) //LE DA VALOR AL NODO
    {
        //VERIFICAR QUE LA LISTA ESTE VACIA, PUES DE OTRA FORMA EL NODO QUE QUEREMOS ANADIR SE CONVERTIRA EN LA CABEZA

        if (vacia() == true)
        {
            cabeza = new nodo(valor); //ESTE NODO SE CONVIERTE EN LA CABEZA DE LA LISTA ENLAZADA
        }

        //BUSCAR HASTA ENCONTRAR EL ULTIMO ELEMENTO, PUES LOS QUE VAN ANTES NO SON NULOS

        nodo mensajero=cabeza;
        while(mensajero.siguinete != null) //ESTE VA A INTERAR HASTA ENCONTRAR UN NODO QUE SU SIGUIENTE NO EXISTA, EL CUAL INDICA QUE ES EL ULTIMO NODO DE LA LISTA
        {
            mensajero = mensajero.siguiente;
        }

        mensajero.siguiente = new nodo(valor);
    }

    public void anadirInicio(int valor)
    {
        //VERIFICAR QUE LA LISTA ESTE VACIA, PUES DE OTRA FORMA EL NODO QUE QUEREMOS ANADIR SE CONVERTIRA EN LA CABEZA

         if (vacia())
         {
            cabeza = new nodo(valor);
         }

         //1. CREAR UN NODO
         nodo nuevo = new nodo (valor);
         nuevo.siguiente = cabeza;
         cabeza = nuevo; //ESTO HACE QUE EL NODO SE PONGA AL PRINCIPIO DE LA LISTA 
    }

    public void borrarValor(int valor)
    {
        //VERIFICAR QUE LA LISTA ESTE VACIA, PUES DE OTRA FORMA EL NODO QUE QUEREMOS ANADIR SE CONVERTIRA EN LA CABEZA

        if (vacia()) 
        {
            System.out.print("Lista vacia"); //SI LA LISTA ESTA VACIA, NO PASA NADA
        } 
        
        if (cabeza.valor == valor) //ELIMINA EL NODO
        {
            cabeza = cabeza.siguiente; //LE DARA EL PUESTO AL NODO QUE SIGUE
        }

        //ITERAR HASTA ENCONTRAR UN NODO QUE QUEREMOS ELIMINAR
        nodo mensajero = cabeza;
        while(mensajero.siguiente != null) //ITERA SIEMPRE Y CUANDO EL QUE SIGUE NO SEA NULO
        {
            if (mensajero.siguiente.valor == valor) //BUSCA QUE EL VALOR QUE BUSCAMOS SEA EL CORRECTO
            {
                 mensajero.siguiente = mensajero.siguiente.siguiente; //DEL VALOR SIGUIENTE, PASA AL QUE SIGUE QUE ES EL QUE BUSCAMOS
            }
            mensajero.mensajero.siguiente;
        }
    }

    public void mostrar()
    {
         //VERIFICAR QUE LA LISTA ESTE VACIA, PUES DE OTRA FORMA EL NODO QUE QUEREMOS ANADIR SE CONVERTIRA EN LA CABEZA

         if (vacia())
         {
            System.out.print("Lista Vacia!");
         }

         nodo mensajero = cabeza;
         while(mensajero != null)
         {
            System.out.print("\n" + mensajero.valor); //SE MUESTRA EL VALOR DEL NODO
            mensajero = mensajero.siguiente; //AVANZA HACIA EL SIGUIENTE NODO 
         }
    }

    private boolean vacia() //NOS PERMITE VER SI LA LISTA ESTA VACIA
    {
        if (cabeza == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}