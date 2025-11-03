package Abstraction;

public class WhyWeNeedAbstraction {
}

//Indian => Hands
//Western => Forks/Spoons

abstract class WayOfEating{
    abstract void eat();
}

class IndianWayOfEating extends WayOfEating{
    @Override
    void eat() {
        System.out.println("Indian people use their hand while eating ");
    }
}

class WesternWayOfEating extends WayOfEating{
    @Override
    void eat() {
        System.out.println("Western people use forks or spoons while eating ");
    }
}

/*The whole purpose of Abstraction is that some other class must extends that class
and provide methods implementation to the abstract method of abstract class.*/