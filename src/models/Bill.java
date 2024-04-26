package models;
import java.util.List;
import java.util.Date;

public class Bill extends BaseModel {
    private Ticket ticket;
    private Date exitTime;
    private double amount;
    private List<Payment> payments;
    private Gate gate;
    private Operator operator;
    private BillStatus billStatus;


}
