package org.chelariulicenta.rezervation.config;


import com.github.dozermapper.core.DozerConverter;

import java.time.LocalDate;

public class LocalDateConverter extends DozerConverter<LocalDate, LocalDate> {

    public LocalDateConverter() {
        super(LocalDate.class, LocalDate.class);
    }

    @Override
    public LocalDate convertTo(final LocalDate from, final LocalDate to) {
        return LocalDate.of(from.getYear(), from.getMonthValue(), from.getDayOfMonth());
    }

    @Override
    public LocalDate convertFrom(final LocalDate from, final LocalDate to) {
        return LocalDate.of(from.getYear(), from.getMonthValue(), from.getDayOfMonth());
    }
}
