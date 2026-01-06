package com.exemplo.funcao;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

public class EvaluationEventFunction {

    @FunctionName("EvaluationEventHandler")
    public void handle(
        @EventGridTrigger(name = "event") String event,
        final ExecutionContext context
    ) {
        context.getLogger().info("Evento recebido:");
        context.getLogger().info(event);

        // aqui você processa a avaliação
    }
}
