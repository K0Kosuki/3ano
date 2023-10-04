function solve_case1
    % Define as equações diferenciais
    a = 1;
    b = 1;
    k = 1;
    c = 0.5;
    d = 0.25;
    l = 0.75;

    % Define as condições iniciais
    P0 = 1;
    Q0 = 1;

    % Define o intervalo de tempo
    tspan = [0 30]; % Intervalo de tempo de 0 a 10 (você pode ajustar isso conforme necessário)

    % Define as funções das equações diferenciais
    odefun = @(t, y) [(a - b * y(1) - k * y(2)) * y(1); (c - d * y(2) - l * y(1)) * y(2)];

    % Resolve as equações diferenciais
    [t, y] = ode45(odefun, tspan, [P0; Q0]);

    % Plota as populações em função do tempo
    figure;
    plot(t, y(:, 1), 'r', 'LineWidth', 2); % População de P em vermelho
    hold on;
    plot(t, y(:, 2), 'b', 'LineWidth', 2); % População de Q em azul
    xlabel('Tempo');
    ylabel('População');
    legend('P', 'Q');
    title('Evolução das Populações P e Q ao Longo do Tempo');
    grid on;
end
