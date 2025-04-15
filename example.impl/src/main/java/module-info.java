module example.impl {
  requires example.api;

  exports org.example.impl;

  provides org.example.api.GreetService with org.example.impl.RudeGreeter, org.example.impl.PoliteGreeter;
}
