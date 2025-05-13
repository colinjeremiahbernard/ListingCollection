package Map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }
    public void exibirProximoEvento() {
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximaEvento = null;
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
     for(
    Map.Entry<LocalDate, Evento> entry:eventosMap.entrySet())

    {
        if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
            proximaData = entry.getKey();
            proximaEvento = entry.getValue();
            System.out.println("O proximo evento : " + proximaEvento
                    + " acontecera na data:  " + proximaData);
            break;
        }
    }
}

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2025, 3, 1),  "January", "Num1");
        agendaEventos.adicionarEvento(LocalDate.of(2030, 8, 21),  "January", "Num2");
        agendaEventos.adicionarEvento(LocalDate.of(2027, 2, 5),  "January", "Num4");
        agendaEventos.adicionarEvento(LocalDate.of(2026, 10, 17),  "January", "Num7");
        agendaEventos.exibirAgenda();
        agendaEventos.exibirProximoEvento();
    }
}
