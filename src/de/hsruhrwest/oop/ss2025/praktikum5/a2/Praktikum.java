package de.hsruhrwest.oop.ss2025.praktikum5.a2;

public class Praktikum extends Pruefung {
    public int scheduledAppointments;
    public int attendedAppointments;

    public Praktikum(String name, int scheduledAppointments, int attendedAppointments) {
        super(name);
        this.scheduledAppointments = scheduledAppointments;
        this.attendedAppointments = attendedAppointments;
    }

    public int getScheduledAppointments() {
        return scheduledAppointments;
    }

    public int getAttendedAppointments() {
        return attendedAppointments;
    }

    public void setScheduledAppointments(int scheduledAppointments) {
        this.scheduledAppointments = scheduledAppointments;
    }

    public void setAttendedAppointments(int attendedAppointments) {
        this.attendedAppointments = attendedAppointments;
    }

    @Override
    public String toString() {
        return this.getName() + "\n" + "Vorhandene Termiene: " + scheduledAppointments +
                " " + "Erschienene Termin: "  + attendedAppointments;
    }

    public boolean isPassed() {
        return scheduledAppointments - attendedAppointments <= 2;
    }


}
