package LgkBase.view;

import LgkBase.backend.basicevent.ConsultationEvent;
import LgkBase.backend.entity.Patient;

/**
 * Created by user on 16.03.2016.
 */
public interface EditFormView {
    Patient getSelectItem();
    void commitEvent();
    void discardEvent();
    ConsultationEvent getFormEvent();
    void createEventPopup(ConsultationEvent consultationEvent, boolean newEvent);
    ConsultationEvent getConsultationEvent();
}

