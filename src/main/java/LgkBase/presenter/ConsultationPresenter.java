package LgkBase.presenter;

import LgkBase.backend.ConsultationManager;
import LgkBase.backend.basicevent.ConsultationEvent;
import LgkBase.backend.entity.Consultation;
import LgkBase.model.ConsultationModel;
import com.vaadin.ui.components.calendar.event.CalendarEvent;

import java.util.*;

/**
 * Created by user on 16.03.2016.
 */
public class ConsultationPresenter {
    public final ConsultationModel consultationModel;

    public final ConsultationManager consultationManager;

    public ConsultationEvent consultationBasicEvent;

    private List<Consultation> consultations = new ArrayList<>();

    public static final ArrayList<String> PROCEDURES = new ArrayList<>(Arrays.asList("Радиохирургия","Заочная консультация","Очная консультация","Оннкология"));
    private List<String> executor = new ArrayList<>(Arrays.asList("физик", "онколог", "планировщик", "врач", "лечащий врач"));


    public ConsultationPresenter(ConsultationModel consultationModel, ConsultationManager consultationManager) {
        this.consultationModel = consultationModel;
        this.consultationManager = consultationManager;
    }

    public void start() {

        GregorianCalendar calendar = new GregorianCalendar(2016, 1, 1);
        Date startDay = calendar.getTime();
        calendar.add(calendar.MONTH, 1);
        Date endDay = calendar.getTime();


        consultations = new ArrayList<>(consultationManager.listConsultation(startDay, endDay));

        for (int i = 0; i < consultations.size(); i++) {
            Random random = new Random();
            int value = random.nextInt(executor.size());
            consultationBasicEvent = new ConsultationEvent("Радиохирургия", "Some description.", consultations.get(i),
                    executor.get(value));
            consultationBasicEvent.setStyleName("mycolor");
            consultationBasicEvent.getStart().setHours(9);
            consultationBasicEvent.getEnd().setHours(18);
            consultationModel.beanItemContainer.addBean(consultationBasicEvent);
        }

    }


}
