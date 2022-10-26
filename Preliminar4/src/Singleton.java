

// Implementacion de una clase singleton en Java
class Singleton {
	// Instancia del singleton, aqui guardaremos su unica instancia 
    private static Singleton instance = null;
    
    // Aca podemos definir datos globales
    private int num;
    
    // Contructor privado, asi no se podra llamar desde fuera
    private Singleton()
    {
    	setNum(0);
    }
    
    // "Constructor publico"
    // Si es la primera vez que se llama crea una instancia nueva
    // De no ser así retorna la ya existente 
    public static Singleton getInstance()
    {
        if (instance == null)
        	instance = new Singleton();
  
        return instance;
    }

    // Getters and setter de los datos
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	// Igualmente se pueden añadir mas metodos y variables 
}