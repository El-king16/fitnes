package fitnes;

import java.time.LocalDate;

public class FitnessClub {
    private Member[] gymMembers;
    private Member[] poolMembers;
    private Member[] groupMembers;

    public FitnessClub()
    {
        gymMembers = new Member[20];
        poolMembers = new Member[20];
        groupMembers = new Member[20];
    }
    public void enterZone(FitnessZone zone, Member member)
    {
        if (zone == FitnessZone.Gym){
            enterZone(gymMembers, member);
            
        } else if (zone == FitnessZone.Pool) {
            enterZone(poolMembers, member);
        } else if (zone == FitnessZone.Group) {
            enterZone(groupMembers, member);
        }
    }
    private void enterZone(Member[] zoneMembers, Member member)
    {
        if (member.getExDate().isBefore(LocalDate.now()))
        {
            System.out.println("Извиниесь, но абонемент непрегоден");
            return;
        }
        if (member.getExDate().isBefore(LocalDate.now()) || !AllowZone(member, zoneMembers))
        {
            System.out.println("Изинитесь, но сюда вход запрещен");
            return;
        }
        for (int i = 0; i < zoneMembers.length; i++)
        {
            if (zoneMembers[i] == null)
            {
                zoneMembers[i] = member;
                System.out.println("Владелец вошел в фитнес зону");
                return;
            }
        }
        System.out.println("На зоне нет сво коек");
    }
    private boolean AllowZone(Member member, Member[] zoneMembers)
    {
        for (Member m : zoneMembers)
        {
            if (m != null && m.equals(member))
            {
                return false;
            }
        }
        return true;
    }
    public void printOwnerInZones()
    {
        System.out.println("Владельцы абонемента для качалки:");
        printMember(gymMembers);

        System.out.println("\nВладельцы абонемента для басейна:");
        printMember(poolMembers);

        System.out.println("\nВладельцы абонемента для групповых занятий:");
        printMember(groupMembers);
    }

    private void printMember(Member[] members)
    {
        for (Member member : members)
        {
            if (member != null)
            {
                Owner owner = member.getOwner();
                System.out.println(owner.getName() + " " + owner.getSurName() +
                        " (Год: " + owner.getYear() + ")");
            }
        }
    }
}