module example.impl {
  requires example.api;

  exports org.example.impl;

  opens org.example.impl;
}
