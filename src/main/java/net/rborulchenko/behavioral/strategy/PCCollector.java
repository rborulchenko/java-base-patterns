package net.rborulchenko.behavioral.strategy;

public class PCCollector {
    public static void main(String[] args) {
        PCSpecialist specialist = new PCSpecialist();
        
        specialist.setType(new GamePC());
        specialist.buildPC();
        
        specialist.setType(new ServerPC());
        specialist.buildPC();
        
        specialist.setType(new WorkStationPC());
        specialist.buildPC();

        specialist.setType(new ServerPC());
        specialist.buildPC();
    }
}
