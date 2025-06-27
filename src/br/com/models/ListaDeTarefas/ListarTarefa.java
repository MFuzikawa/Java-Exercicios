package br.com.models.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListarTarefa {
    private List<Tarefa> listarTarefa;

    public ListarTarefa() {
        this.listarTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listarTarefa.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : listarTarefa) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        listarTarefa.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return listarTarefa.size();
    }
    public void obterDescricoesTarefa() {
        System.out.println(listarTarefa);
    }
}
