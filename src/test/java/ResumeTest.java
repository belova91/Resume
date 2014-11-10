import org.junit.Test;

import java.util.ArrayList;

public class ResumeTest {

    @Test
    public void testResume1() {

        ArrayList<Education> education = new ArrayList<Education>();
        ArrayList<Experience> experience = new ArrayList<Experience>();
        ArrayList<String> skill = new ArrayList<String>();

        education.add(new Education(1993, 1998, "Киевский Национальный университет им. Т.Г.Шевченко", "кибернетический", "теоретическая кибернетика и теория программирования"));

        experience.add(new Experience(1998, 2002, "интернет-центр «Олимпус»", "помощник системного администратора", "поддержка базы данных, учет клиентов"));
        experience.add(new Experience(2002, 2005, "фирма «Галактика»", "системный администратор", "администрирование, проектирование и ведение баз данных"));
        experience.add(new Experience(2005, 2014, "ООО «Евротранс»", "программист", "программирование, системное администрирование, администрирование сервера электронной почты и видонаблюдения, контроль программного и аппаратного обеспечения"));

        skill.add("администрирование серверов Windows и на базе Unix");
        skill.add("проектирование и ведение баз данных");
        skill.add("написание приложений и модулей");
        skill.add("многопотоковое программирование на базе SIP, Radius server");
        skill.add("владение Delphi, Firebird, MS Sql Server Delphi, С/С++(Unix/Linux), PHP, DHTML, XML");

        Resume resume = new Resume("Иван", "Иванов", "Мужской", new ProfileAddress("Россия", "Москва", "Тверская", "7", "3"), "+7 (910) 987 65 43", "ivan@ivanov.com", education, experience, skill);

        System.out.println(resume.toString());

    }

}
