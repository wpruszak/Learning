class AchievementsController < ApplicationController

  def new
    @achievement = Achievement.new
  end

  def create
    @achievement = Achievement.new(achievements_params)
    if @achievement.save
      redirect_to root_url, notice: 'Achievement has been created.'
    end
  end

  private

  def achievements_params
    params.require(:achievement).permit(:title, :description, :privacy, :featured, :cover_image)
  end

end