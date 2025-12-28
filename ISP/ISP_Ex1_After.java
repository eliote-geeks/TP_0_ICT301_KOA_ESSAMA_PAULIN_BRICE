interface Workable {
    void work();
}

interface Eatable extends Workable {
    void eat();
}

class HumanWorker implements Eatable {
    @Override
    public void work() {
        System.out.println("Les humains travaillent");
    }

    @Override
    public void eat() {
        System.out.println("Les humains mangent");
    }
}

class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Les Robots travaillent sans fatigue");
    }
}

class MainISPAfter {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();

        RobotWorker robot = new RobotWorker();
        robot.work();
    }
}
