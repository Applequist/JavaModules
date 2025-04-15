module example.app {
  requires example.api;

  exports org.example.app;

  uses org.example.api.GreetService;
}
