package arquiteturadesw.designpatternsgof.decorator;

public class JobWithEmailAlert extends JobDecorator {
    JobWithEmailAlert(Job job) {
        super(job);
    }

    @Override
    public void execute() {
        job.execute();

        sendEmail();
    }

    private void sendEmail() {
        // ...
    }
}
