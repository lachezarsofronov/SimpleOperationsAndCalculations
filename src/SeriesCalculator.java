import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String SerialName = input.nextLine();
        int SeasonsCount = Integer.parseInt(input.nextLine());
        int EpisodesCount = Integer.parseInt(input.nextLine());
        double NoAdEpisodeTime = Double.parseDouble(input.nextLine());

        double AdTimePerEpisode = NoAdEpisodeTime * 0.2;

        double CleanTimePerEpisode = NoAdEpisodeTime + AdTimePerEpisode;
        double TotalEpisodesNeeded= SeasonsCount * EpisodesCount * CleanTimePerEpisode + (SeasonsCount * 10);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", SerialName, TotalEpisodesNeeded);
    }
}
