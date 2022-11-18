import Books.*;
import Clients.Middle;
import Clients.Old;
import Clients.Senile;
import Clients.Young;
import Employees.*;

public class Main {
    public static void main(String[] args) {
        Adventure a = new Adventure("Искатели приключений", 52, "отличное");
        Classic c = new Classic("Война и мир", 2452, "среднее");
        Detective d = new Detective("Глухарь", 247, "хорошее");
        Fantastic f = new Fantastic("Земля будущего", 127, "отличное");
        Historic h = new Historic("История России", 978, "среднее");
        System.out.println(a.give_out() + "\n" + c.give_out() + "\n" + d.give_out() + "\n" + f.give_out() + "\n" + h.give_out());
        Middle m = new Middle("Юрий", "мужской");
        Old o = new Old("Михаил Антонович", "мужской");
        Senile s = new Senile("Валерия Владимировна", "женский");
        Young y = new Young("Кирилл", "мужской");
        m.get_Book();
        o.get_Book();
        s.get_Book();
        y.get_Book();
        Chief_bibliographer cb = new Chief_bibliographer("Алексей Васильевич", "мужской");
        Chief_librarian cl = new Chief_librarian("Василий Павлович", "мужской");
        Cleaner cln = new Cleaner("Людмила", "женский");
        Librarian lb = new Librarian("Зоя Николаевна", "женский");
        Mover mv = new Mover("Расул", "мужской");
        cb.working_time();
        cl.working_time();
        cln.working_time();
        lb.working_time();
        mv.working_time();
        outprint();
    }
    final static void outprint(){
        System.out.println("\nКонец списка");
    }
}
