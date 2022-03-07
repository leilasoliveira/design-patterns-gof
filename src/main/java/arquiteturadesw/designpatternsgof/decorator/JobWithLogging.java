package arquiteturadesw.designpatternsgof.decorator;

public class JobWithLogging extends JobDecorator {
    JobWithLogging(Job job) {
        super(job);
    }

    @Override
    public void execute() {
        job.execute();

        logging();
    }

    private void logging() {
        // ...
    }
}
