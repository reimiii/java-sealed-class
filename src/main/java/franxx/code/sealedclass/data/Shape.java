package franxx.code.sealedclass.data;


public sealed interface Shape permits Circle, Rectangles, Triangle {
}
