public class Fish implements Prey,Predator{
    @Override
    public void Hunt() {
        System.out.println("This fish is HUNTING");
    }

    @Override
    public void flee() {
        System.out.println("This fish is fleeing");
    }
}
