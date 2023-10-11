package Apis;

import Asteroides.Asteroide;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface Font {

    List<Asteroide> getAsteroideByDate(LocalDate avui,LocalDate ahir);

}
