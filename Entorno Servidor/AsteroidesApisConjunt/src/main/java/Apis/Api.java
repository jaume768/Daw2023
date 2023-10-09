package Apis;

import Asteroides.Asteroide;

import java.time.LocalDateTime;
import java.util.List;

public interface Api {

    List<Asteroide> getAsteroideByDate();

}
