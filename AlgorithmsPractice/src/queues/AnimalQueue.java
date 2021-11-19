import java.util.Iterator;
import java.util.LinkedList;

public class AnimalQueue {
	private LinkedList<Animal> queue = new LinkedList<Animal>();
	
	public void enqueue(Animal animal) { //O(1) O(1)
        queue.add(animal);
    }
	
	public Animal dequeueAny() { //O(1) O(1)
		Animal animal = queue.remove();
        return animal;
    }
	
	public Animal dequeueDog() { //O(N)  O(1)
        Iterator<Animal> it = queue.descendingIterator();
        int count = queue.size() - 1;

        while (it.hasNext()) {
            Animal animal = (Animal) it.next();
            String species = animal.getSpecies();
            if (species.equals("dog")) {
                return queue.remove(count);
            }
            count-=1;
        }
        return null;
    }

    public Animal dequeueCat() { //O(N)  O(1)
        Iterator it = queue.descendingIterator();
        int count = queue.size() - 1;

        while (it.hasNext()) {
            Animal animal = (Animal) it.next();
            String species = animal.getSpecies();
            if (species.equals("cat")) {
                return queue.remove(count);
            }
            count-=1;
        }
        return null;
    }
    
    public Animal dequeueSpecies(String str) { //O(N)  O(1)
        Iterator it = queue.descendingIterator();
        int count = queue.size() - 1;

        while (it.hasNext()) {
            Animal animal = (Animal) it.next();
            String species = animal.getSpecies();
            if (species.equals(str)) {
                return queue.remove(count);
            }
            count-=1;
        }
        return null;
    }
    


	public static void main(String[] args) {
		AnimalQueue aq= new AnimalQueue();
		
		aq.enqueue(new Cat());
		aq.enqueue(new Dog());
		System.out.println(aq.dequeueSpecies("dog").getSpecies());
		
	}
}
