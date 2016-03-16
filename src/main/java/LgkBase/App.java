package LgkBase;

import LgkBase.backend.ConsultationManager;
import LgkBase.model.ConsultationModel;
import LgkBase.presenter.EditFormPresenter;
import LgkBase.presenter.Presenter;
import LgkBase.view.CalendarView;
import LgkBase.view.CalendarViewImpl;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.UI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 16.03.2016.
 */

@Theme("mytheme")
// @Widgetset("LgkBase.MyAppWidgetset")
public class App extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        ConsultationModel consultationModel = new ConsultationModel();
        ConsultationManager consultationManager = new ConsultationManager();
        Presenter editFormPresenter = new EditFormPresenter(consultationModel,consultationManager);
        CalendarView calendarView = new CalendarViewImpl(consultationModel,consultationManager);
        calendarView.setEditFormPresenter(editFormPresenter);

        TabSheet tabSheet = new TabSheet();
        tabSheet.setHeightUndefined();
        tabSheet.addTab((CalendarViewImpl)calendarView,"Радиохирургия");
        tabSheet.addTab(new Button("кнопка"),"Очные");
        tabSheet.addTab(new Button("кнопка"),"Заочные");
        tabSheet.addTab(new Button("кнопка"),"Онкология");
        setContent(tabSheet);

    }

    @WebServlet(urlPatterns = "/*", name = "AppServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = App.class, productionMode = false)
    public static class AppServlet extends VaadinServlet {
        @Override
        protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          super.service(request, response);
        }
    }
}
