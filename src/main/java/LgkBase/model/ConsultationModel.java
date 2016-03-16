package LgkBase.model;

import LgkBase.backend.basicevent.ConsultationEvent;
import com.vaadin.data.util.BeanItemContainer;

/**
 * Created by user on 16.03.2016.
 */
public class ConsultationModel {
    public final BeanItemContainer<ConsultationEvent> beanItemContainer = new BeanItemContainer<>(ConsultationEvent.class);

    public BeanItemContainer<ConsultationEvent> getConsultationBAsicEventContainer() {
        return beanItemContainer;
    }

}
