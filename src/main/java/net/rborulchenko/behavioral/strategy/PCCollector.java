package net.rborulchenko.behavioral.strategy;

public class PCCollector {
    public static void main(String[] args) {
        PCSpecialist specialist = new PCSpecialist();
        
        specialist.setType(new GamePC());
        specialist.buildPC();
        
        specialist.setType(new Server());
        specialist.buildPC();
        
        specialist.setType(new WorkStation());
        specialist.buildPC();

        specialist.setType(new Server());
        specialist.buildPC();
    }
}
