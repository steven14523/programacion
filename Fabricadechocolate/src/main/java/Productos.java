
public class Productos {
    public String nombre;
    public int Peso;
    public  float precio;
    
    public Productos arreglo[] = new Productos[10];
    
    public Productos(){
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", Peso=" + Peso + ", precio=" + precio + ", arreglo=" + arreglo + '}';
            this.nombre = nombre;
            this.Peso = Peso;
            this.precio = precio;
    } public void datosProdcutos() {
        arreglo[0] = new Productos("Queque","2.5kg","2500");
        arreglo[1] = new Productos("Barra de chocolate", "350gm", "1500");
        arreglo[2] = new Prodcutos("chocolate en polvo", "350gm", "1200");
        
    

   
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Productos[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Productos[] arreglo) {
        this.arreglo = arreglo;
    }
    
    
    }
    

