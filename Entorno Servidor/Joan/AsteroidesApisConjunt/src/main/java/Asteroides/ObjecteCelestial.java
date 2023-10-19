package Asteroides;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public abstract @Data class ObjecteCelestial {

    private String nomCientific;

    public abstract boolean isEsPerillos();

}
