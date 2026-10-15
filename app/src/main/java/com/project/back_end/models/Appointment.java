import java.time.LocalDateTime;

@Entity
public class Appointment{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @NotNull
    private Doctor doctor;
    @ManyToOne
    @NotNull
    private Patient patient;
    @Future(message = "Appointment time must be in the future")
    private LocalDateTime appointmentTime;
    private Integer status;

    @Transient
    public LocalDateTime getEndTime(){
        return appointmentTime.plusHours(1);
    }

    @Transient
    public String getAppointmentDate(){
        return appointmentTime.toLocalDate().toString;
    }

    @Transient
    public LocalDateTime getAppointmentTimeOnly(){
    return null;
    }

    
}