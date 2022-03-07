package arquiteturadesw.designpatternsgof.decorator;

public abstract class JobDecorator extends Job {

    protected Job job;

    public JobDecorator(Job job) {
        this.job = job;
    }

}
