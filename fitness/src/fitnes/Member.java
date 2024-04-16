package fitnes;

import java.time.LocalDate;

public class Member
{
    private LocalDate regDate;
    private LocalDate exDate;
    private Owner owner;

    public Member(LocalDate regDate, LocalDate exDate, Owner owner) {
        this.regDate = regDate;
        this.exDate = exDate;
        this.owner = owner;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public LocalDate getExDate() {
        return exDate;
    }

    public void setExDate(LocalDate exDate) {
        this.exDate = exDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}